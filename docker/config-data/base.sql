DROP SCHEMA IF EXISTS survey CASCADE;
-- Schema
CREATE SCHEMA IF NOT EXISTS survey;

-- Likert Enum
CREATE TYPE survey.likert_enum AS ENUM (
    'STRONGLY_DISAGREE',
    'DISAGREE',
    'SOMEWHAT_DISAGREE',
    'NEITHER_AGREE_NOR_DISAGREE',
    'SOMEWHAT_AGREE',
    'AGREE',
    'STRONGLY_AGREE'
    );

-- Gender Enum
CREATE TYPE survey.gender AS ENUM (
    'MALE',
    'FEMALE',
    'PREFER_NOT_TO_SAY'
    );

-- Question Category Enum
CREATE TYPE survey.question_category AS ENUM (
    'DIGITAL_CONSUMPTION',
    'PERCEPTION_EVALUATION',
    'PERSONAL_FOCUS_AND_WELL_BEING',
    'INTERNET_USAGE_FREQUENCY',
    'DISCUSSION_AND_SHARING_BEHAVIOR'
    );

-- Sections table
CREATE TABLE survey.sections (
                                 id BIGSERIAL PRIMARY KEY,
                                 uuid UUID NOT NULL,
                                 category survey.question_category NOT NULL UNIQUE,
                                 title TEXT NOT NULL
);

-- Questions table (8 dimension weights per question)
CREATE TABLE survey.questions (
                                  id BIGSERIAL PRIMARY KEY,
                                  uuid UUID NOT NULL,
                                  full_question VARCHAR(1000) NOT NULL,
                                  section_id BIGINT NOT NULL REFERENCES survey.sections(id) ON DELETE RESTRICT,
                                  life_satisfaction DOUBLE PRECISION,
                                  digital_self_regulation DOUBLE PRECISION,
                                  online_privacy_and_control DOUBLE PRECISION,
                                  emotional_resilience DOUBLE PRECISION,
                                  problematic_internet_use_anxiety DOUBLE PRECISION,
                                  community_engagement DOUBLE PRECISION,
                                  social_pressure DOUBLE PRECISION,
                                  recommendation_satisfaction DOUBLE PRECISION
);

-- Respondents table
CREATE TABLE survey.respondents (
                                    id BIGSERIAL PRIMARY KEY,
                                    uuid UUID NOT NULL,
                                    age INTEGER,
                                    gender survey.gender,
                                    avg_screen_time_hours DOUBLE PRECISION
);

-- Likerts table
CREATE TABLE survey.likerts (
                                id BIGSERIAL PRIMARY KEY,
                                likert_value survey.likert_enum NOT NULL
);

-- Records table
CREATE TABLE survey.records (
                                id BIGSERIAL PRIMARY KEY,
                                uuid UUID NOT NULL,
                                question_id BIGINT NOT NULL REFERENCES survey.questions(id) ON DELETE RESTRICT,
                                section_id BIGINT NOT NULL REFERENCES survey.sections(id) ON DELETE RESTRICT,
                                likert_value survey.likert_enum NOT NULL
);
