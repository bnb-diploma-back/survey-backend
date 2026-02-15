package kz.survey;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public ResponseEntity<Map<String, String>> handleHttpMessageNotReadable(HttpMessageNotReadableException ex) {
    String message = ex.getMessage();
    if (message != null && (message.contains("Unexpected end-of-input") || message.contains("Required request body"))) {
      message = "Request body is required and must be valid JSON";
    } else if (message != null && message.length() > 80) {
      message = "Invalid JSON in request body";
    }
    return ResponseEntity
        .status(HttpStatus.BAD_REQUEST)
        .body(Map.of("error", message != null ? message : "Invalid request body"));
  }
}
