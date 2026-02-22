UPDATE survey.questions
SET life_satisfaction = 0,
    digital_self_regulation = 5,
    online_privacy_and_control = 0,
    emotional_resilience = 1,
    problematic_internet_use_anxiety = -3,
    community_engagement = 0,
    social_pressure = -1,
    recommendation_satisfaction = 0
WHERE full_question = 'I intentionally set limits on my screen use.';

UPDATE survey.questions
SET life_satisfaction = 0,
    digital_self_regulation = 5,
    online_privacy_and_control = 0,
    emotional_resilience = 1,
    problematic_internet_use_anxiety = -4,
    community_engagement = 0,
    social_pressure = -1,
    recommendation_satisfaction = 0
WHERE full_question = 'I can control how much time I spend on screens.';

UPDATE survey.questions
SET life_satisfaction = 0,
    digital_self_regulation = -5,
    online_privacy_and_control = 0,
    emotional_resilience = -1,
    problematic_internet_use_anxiety = 4,
    community_engagement = 0,
    social_pressure = 1,
    recommendation_satisfaction = 0
WHERE full_question = 'I often lose track of time while using screens.';

UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 4,
    online_privacy_and_control = 0,
    emotional_resilience = 3,
    problematic_internet_use_anxiety = -2,
    community_engagement = 0,
    social_pressure = -1,
    recommendation_satisfaction = 0
WHERE full_question = 'I am ready to be responsible for the negative outcomes caused by my screen use.';

UPDATE survey.questions
SET life_satisfaction = 3,
    digital_self_regulation = 4,
    online_privacy_and_control = 0,
    emotional_resilience = 1,
    problematic_internet_use_anxiety = -2,
    community_engagement = 1,
    social_pressure = 0,
    recommendation_satisfaction = 2
WHERE full_question = 'My screen use supports my personal or professional goals.';

UPDATE survey.questions
SET life_satisfaction = -2,
    digital_self_regulation = -5,
    online_privacy_and_control = 0,
    emotional_resilience = -2,
    problematic_internet_use_anxiety = 4,
    community_engagement = 0,
    social_pressure = 1,
    recommendation_satisfaction = 0
WHERE full_question = 'Screen time distracts me from important tasks.';

UPDATE survey.questions
SET life_satisfaction = 2,
    digital_self_regulation = 5,
    online_privacy_and_control = 0,
    emotional_resilience = 1,
    problematic_internet_use_anxiety = -3,
    community_engagement = 1,
    social_pressure = -1,
    recommendation_satisfaction = 1
WHERE full_question = 'I use digital technologies mainly for purposeful activities.';

UPDATE survey.questions
SET life_satisfaction = 2,
    digital_self_regulation = 1,
    online_privacy_and_control = 1,
    emotional_resilience = 2,
    problematic_internet_use_anxiety = -1,
    community_engagement = 5,
    social_pressure = 1,
    recommendation_satisfaction = 0
WHERE full_question = 'I feel that my actions matter in online communities.';

UPDATE survey.questions
SET life_satisfaction = 2,
    digital_self_regulation = 1,
    online_privacy_and_control = 1,
    emotional_resilience = 3,
    problematic_internet_use_anxiety = -1,
    community_engagement = 4,
    social_pressure = -1,
    recommendation_satisfaction = 0
WHERE full_question = 'I can positively influence others in digital spaces.';

UPDATE survey.questions
SET life_satisfaction = -1,
    digital_self_regulation = -3,
    online_privacy_and_control = -5,
    emotional_resilience = -2,
    problematic_internet_use_anxiety = 3,
    community_engagement = -2,
    social_pressure = 1,
    recommendation_satisfaction = 0
WHERE full_question = 'I feel powerless in online environments.';

UPDATE survey.questions
SET life_satisfaction = 2,
    digital_self_regulation = 1,
    online_privacy_and_control = 0,
    emotional_resilience = 3,
    problematic_internet_use_anxiety = -1,
    community_engagement = 4,
    social_pressure = 0,
    recommendation_satisfaction = 1
WHERE full_question = 'Online connections help me during difficult times.';
-- 13. Improper behavior by others online stresses or annoys me
UPDATE survey.questions
SET life_satisfaction = -1,
    digital_self_regulation = -2,
    online_privacy_and_control = 0,
    emotional_resilience = -4,
    problematic_internet_use_anxiety = 2,
    community_engagement = 0,
    social_pressure = 1,
    recommendation_satisfaction = 0
WHERE full_question = 'Improper behavior by others online stresses or annoys me.';

-- 14. I feel good when people online behave respectfully
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 0,
    online_privacy_and_control = 0,
    emotional_resilience = 2,
    problematic_internet_use_anxiety = -1,
    community_engagement = 1,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I feel good when people online behave respectfully.';

-- 15. I appreciate it when users consider appropriateness before sharing content
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 0,
    online_privacy_and_control = 0,
    emotional_resilience = 2,
    problematic_internet_use_anxiety = -1,
    community_engagement = 1,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I appreciate it when users consider appropriateness before sharing content.';

-- 16. Respectful behavior online makes digital spaces enjoyable
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 0,
    online_privacy_and_control = 0,
    emotional_resilience = 2,
    problematic_internet_use_anxiety = -1,
    community_engagement = 1,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'Respectful behavior online makes digital spaces enjoyable.';

-- 17. Online spaces often feel hostile or disrespectful
UPDATE survey.questions
SET life_satisfaction = -2,
    digital_self_regulation = -1,
    online_privacy_and_control = 0,
    emotional_resilience = -5,
    problematic_internet_use_anxiety = 3,
    community_engagement = -1,
    social_pressure = 2,
    recommendation_satisfaction = 0
WHERE full_question = 'Online spaces often feel hostile or disrespectful.';

-- 18. In most ways my life is close to my ideal
UPDATE survey.questions
SET life_satisfaction = 5,
    digital_self_regulation = 0,
    online_privacy_and_control = 0,
    emotional_resilience = 2,
    problematic_internet_use_anxiety = 0,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'In most ways my life is close to my ideal.';

-- 19. The conditions of my life are excellent
UPDATE survey.questions
SET life_satisfaction = 5,
    digital_self_regulation = 0,
    online_privacy_and_control = 0,
    emotional_resilience = 2,
    problematic_internet_use_anxiety = 0,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'The conditions of my life are excellent.';

-- 20. I am satisfied with my life
UPDATE survey.questions
SET life_satisfaction = 5,
    digital_self_regulation = 0,
    online_privacy_and_control = 0,
    emotional_resilience = 2,
    problematic_internet_use_anxiety = 0,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I am satisfied with my life.';

-- 21. So far I have gotten the important things I want in life
UPDATE survey.questions
SET life_satisfaction = 5,
    digital_self_regulation = 0,
    online_privacy_and_control = 0,
    emotional_resilience = 2,
    problematic_internet_use_anxiety = 0,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'So far I have gotten the important things I want in life.';

-- 22. If I could live my life over, I would change almost nothing
UPDATE survey.questions
SET life_satisfaction = 5,
    digital_self_regulation = 0,
    online_privacy_and_control = 0,
    emotional_resilience = 1,
    problematic_internet_use_anxiety = 0,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'If I could live my life over, I would change almost nothing.';

-- 23. I feel in control over the information I provide on social networking sites
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 1,
    online_privacy_and_control = 5,
    emotional_resilience = 1,
    problematic_internet_use_anxiety = -1,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I feel in control over the information I provide on social networking sites.';

-- 24. Privacy settings allow me to have full control over the information I provide on social networking sites
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 1,
    online_privacy_and_control = 5,
    emotional_resilience = 1,
    problematic_internet_use_anxiety = -1,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'Privacy settings allow me to have full control over the information I provide on social networking sites.';

-- 25. I feel in control of who can view my information on social networking sites
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 1,
    online_privacy_and_control = 5,
    emotional_resilience = 1,
    problematic_internet_use_anxiety = -1,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I feel in control of who can view my information on social networking sites.';

-- 26. I am very attached to my online communities (e.g., forums, social media groups, online games)
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 1,
    online_privacy_and_control = 0,
    emotional_resilience = 2,
    problematic_internet_use_anxiety = -1,
    community_engagement = 5,
    social_pressure = 0,
    recommendation_satisfaction = 1
WHERE full_question = 'I am very attached to my online communities (e.g., forums, social media groups, online games).';

-- 27. Other members of my online communities and I share the same objectives
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 1,
    online_privacy_and_control = 0,
    emotional_resilience = 1,
    problematic_internet_use_anxiety = 0,
    community_engagement = 5,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'Other members of my online communities and I share the same objectives.';
-- 28. The friendships I have with other online community members mean a lot to me
UPDATE survey.questions
SET life_satisfaction = 2,
    digital_self_regulation = 1,
    online_privacy_and_control = 0,
    emotional_resilience = 3,
    problematic_internet_use_anxiety = -1,
    community_engagement = 5,
    social_pressure = 0,
    recommendation_satisfaction = 1
WHERE full_question = 'The friendships I have with other online community members mean a lot to me.';

-- 29. I see myself as part of my online communities
UPDATE survey.questions
SET life_satisfaction = 2,
    digital_self_regulation = 1,
    online_privacy_and_control = 0,
    emotional_resilience = 2,
    problematic_internet_use_anxiety = -1,
    community_engagement = 5,
    social_pressure = 0,
    recommendation_satisfaction = 1
WHERE full_question = 'I see myself as part of my online communities.';

-- 30. I am motivated to participate in the online community's activities because I am able to reach personal goals
UPDATE survey.questions
SET life_satisfaction = 2,
    digital_self_regulation = 3,
    online_privacy_and_control = 0,
    emotional_resilience = 2,
    problematic_internet_use_anxiety = -1,
    community_engagement = 5,
    social_pressure = 1,
    recommendation_satisfaction = 2
WHERE full_question = 'I am motivated to participate in the online community''s activities because I am able to reach personal goals.';

-- 31. It is easy for me to concentrate on what I am doing
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 4,
    online_privacy_and_control = 0,
    emotional_resilience = 2,
    problematic_internet_use_anxiety = -2,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'It is easy for me to concentrate on what I am doing.';

-- 32. I can tolerate emotional pain
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 3,
    online_privacy_and_control = 0,
    emotional_resilience = 5,
    problematic_internet_use_anxiety = -1,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I can tolerate emotional pain.';

-- 33. I can accept things I cannot change
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 3,
    online_privacy_and_control = 0,
    emotional_resilience = 5,
    problematic_internet_use_anxiety = -1,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I can accept things I cannot change.';

-- 34. I can usually describe how I feel at the moment in considerable detail
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 3,
    online_privacy_and_control = 0,
    emotional_resilience = 4,
    problematic_internet_use_anxiety = -1,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I can usually describe how I feel at the moment in considerable detail.';

-- 35. It's easy for me to keep track of my thoughts and feelings
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 4,
    online_privacy_and_control = 0,
    emotional_resilience = 4,
    problematic_internet_use_anxiety = -1,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'It''s easy for me to keep track of my thoughts and feelings.';

-- 36. I try to notice my thoughts without judging them
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 3,
    online_privacy_and_control = 0,
    emotional_resilience = 4,
    problematic_internet_use_anxiety = -1,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I try to notice my thoughts without judging them.';

-- 37. I am able to accept the thoughts and feelings I have
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 3,
    online_privacy_and_control = 0,
    emotional_resilience = 5,
    problematic_internet_use_anxiety = -1,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I am able to accept the thoughts and feelings I have.';

-- 38. I am able to focus on the present moment
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 4,
    online_privacy_and_control = 0,
    emotional_resilience = 4,
    problematic_internet_use_anxiety = -2,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I am able to focus on the present moment.';

-- 39. I am able to pay close attention to one thing for a long period of time
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 5,
    online_privacy_and_control = 0,
    emotional_resilience = 3,
    problematic_internet_use_anxiety = -2,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I am able to pay close attention to one thing for a long period of time.';

-- 40. I've been feeling optimistic about the future
UPDATE survey.questions
SET life_satisfaction = 4,
    digital_self_regulation = 2,
    online_privacy_and_control = 0,
    emotional_resilience = 4,
    problematic_internet_use_anxiety = -1,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I''ve been feeling optimistic about the future.';

-- 41. I've been feeling useful
UPDATE survey.questions
SET life_satisfaction = 3,
    digital_self_regulation = 2,
    online_privacy_and_control = 0,
    emotional_resilience = 3,
    problematic_internet_use_anxiety = -1,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I''ve been feeling useful.';

-- 42. I've been feeling relaxed
UPDATE survey.questions
SET life_satisfaction = 3,
    digital_self_regulation = 2,
    online_privacy_and_control = 0,
    emotional_resilience = 4,
    problematic_internet_use_anxiety = -1,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I''ve been feeling relaxed.';

-- 43. I've been dealing with problems well
UPDATE survey.questions
SET life_satisfaction = 3,
    digital_self_regulation = 3,
    online_privacy_and_control = 0,
    emotional_resilience = 5,
    problematic_internet_use_anxiety = -1,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I''ve been dealing with problems well.';

-- 44. I've been thinking clearly
UPDATE survey.questions
SET life_satisfaction = 2,
    digital_self_regulation = 4,
    online_privacy_and_control = 0,
    emotional_resilience = 3,
    problematic_internet_use_anxiety = 0,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I''ve been thinking clearly.';

-- 45. I've been feeling close to other people
UPDATE survey.questions
SET life_satisfaction = 3,
    digital_self_regulation = 1,
    online_privacy_and_control = 0,
    emotional_resilience = 3,
    problematic_internet_use_anxiety = -1,
    community_engagement = 4,
    social_pressure = 0,
    recommendation_satisfaction = 1
WHERE full_question = 'I''ve been feeling close to other people.';

-- 46. I've been able to make up my own mind about things
UPDATE survey.questions
SET life_satisfaction = 2,
    digital_self_regulation = 3,
    online_privacy_and_control = 0,
    emotional_resilience = 3,
    problematic_internet_use_anxiety = 0,
    community_engagement = 0,
    social_pressure = 0,
    recommendation_satisfaction = 0
WHERE full_question = 'I''ve been able to make up my own mind about things.';

-- 47. I spend time online when I'd rather sleep
UPDATE survey.questions
SET life_satisfaction = -1,
    digital_self_regulation = -4,
    online_privacy_and_control = 0,
    emotional_resilience = -1,
    problematic_internet_use_anxiety = 3,
    community_engagement = 0,
    social_pressure = 1,
    recommendation_satisfaction = 0
WHERE full_question = 'I spend time online when I''d rather sleep.';

-- 48. I feel tense, irritated, or stressed if I cannot use the Internet as long as I want to
UPDATE survey.questions
SET life_satisfaction = -1,
    digital_self_regulation = -5,
    online_privacy_and_control = 0,
    emotional_resilience = -2,
    problematic_internet_use_anxiety = 5,
    community_engagement = 0,
    social_pressure = 1,
    recommendation_satisfaction = 0
WHERE full_question = 'I feel tense, irritated, or stressed if I cannot use the Internet as long as I want to.';

-- 49. I wish to decrease the amount of time spent online but do not succeed
UPDATE survey.questions
SET life_satisfaction = -2,
    digital_self_regulation = -5,
    online_privacy_and_control = 0,
    emotional_resilience = -1,
    problematic_internet_use_anxiety = 4,
    community_engagement = 0,
    social_pressure = 1,
    recommendation_satisfaction = 0
WHERE full_question = 'I wish to decrease the amount of time spent online but do not succeed.';

-- 50. I try to conceal the amount of time spent online
UPDATE survey.questions
SET life_satisfaction = -1,
    digital_self_regulation = -4,
    online_privacy_and_control = 0,
    emotional_resilience = -1,
    problematic_internet_use_anxiety = 3,
    community_engagement = 0,
    social_pressure = 1,
    recommendation_satisfaction = 0
WHERE full_question = 'I try to conceal the amount of time spent online.';

-- 51. People in my life complain about me spending too much time online
UPDATE survey.questions
SET life_satisfaction = -2,
    digital_self_regulation = -4,
    online_privacy_and_control = 0,
    emotional_resilience = -1,
    problematic_internet_use_anxiety = 4,
    community_engagement = 0,
    social_pressure = 2,
    recommendation_satisfaction = 0
WHERE full_question = 'People in my life complain about me spending too much time online.';

-- 52. I feel depressed, moody, or nervous when I am not online, and these feelings stop once I am back online
UPDATE survey.questions
SET life_satisfaction = -2,
    digital_self_regulation = -5,
    online_privacy_and_control = 0,
    emotional_resilience = -2,
    problematic_internet_use_anxiety = 5,
    community_engagement = 0,
    social_pressure = 2,
    recommendation_satisfaction = 0
WHERE full_question = 'I feel depressed, moody, or nervous when I am not online, and these feelings stop once I am back online.';

-- 53. The videos/posts recommended to me usually match my interests
UPDATE survey.questions
SET life_satisfaction = 2,
    digital_self_regulation = 0,
    online_privacy_and_control = 0,
    emotional_resilience = 1,
    problematic_internet_use_anxiety = -1,
    community_engagement = 1,
    social_pressure = 0,
    recommendation_satisfaction = 5
WHERE full_question = 'The videos/posts recommended to me usually match my interests.';

-- 54. My recommended feed helps me discover new and useful information
UPDATE survey.questions
SET life_satisfaction = 2,
    digital_self_regulation = 0,
    online_privacy_and_control = 0,
    emotional_resilience = 1,
    problematic_internet_use_anxiety = -1,
    community_engagement = 1,
    social_pressure = 0,
    recommendation_satisfaction = 5
WHERE full_question = 'My recommended feed helps me discover new and useful information.';

-- 55. I feel bored when the recommendations become repetitive
UPDATE survey.questions
SET life_satisfaction = -1,
    digital_self_regulation = 0,
    online_privacy_and_control = 0,
    emotional_resilience = -1,
    problematic_internet_use_anxiety = 1,
    community_engagement = 1,
    social_pressure = 0,
    recommendation_satisfaction = -3
WHERE full_question = 'I feel bored when the recommendations become repetitive.';

-- 56. I believe my recommended feed improves my overall social media experience
UPDATE survey.questions
SET life_satisfaction = 2,
    digital_self_regulation = 0,
    online_privacy_and_control = 0,
    emotional_resilience = 1,
    problematic_internet_use_anxiety = -1,
    community_engagement = 1,
    social_pressure = 0,
    recommendation_satisfaction = 5
WHERE full_question = 'I believe my recommended feed improves my overall social media experience.';

-- 57. I often share recommended videos/posts with my friends
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 0,
    online_privacy_and_control = 0,
    emotional_resilience = 1,
    problematic_internet_use_anxiety = -1,
    community_engagement = 4,
    social_pressure = 1,
    recommendation_satisfaction = 5
WHERE full_question = 'I often share recommended videos/posts with my friends.';

-- 58. My friends and I often discuss the content we see on our feeds
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 0,
    online_privacy_and_control = 0,
    emotional_resilience = 1,
    problematic_internet_use_anxiety = -1,
    community_engagement = 4,
    social_pressure = 1,
    recommendation_satisfaction = 4
WHERE full_question = 'My friends and I often discuss the content we see on our feeds.';

-- 59. We compare how similar or different our feeds are
UPDATE survey.questions
SET life_satisfaction = 1,
    digital_self_regulation = 0,
    online_privacy_and_control = 0,
    emotional_resilience = 0,
    problematic_internet_use_anxiety = 0,
    community_engagement = 3,
    social_pressure = 5,
    recommendation_satisfaction = 4
WHERE full_question = 'We compare how similar or different our feeds are.';

-- 60. Sharing personalized content helps me connect with others
UPDATE survey.questions
SET life_satisfaction = 2,
    digital_self_regulation = 1,
    online_privacy_and_control = 0,
    emotional_resilience = 1,
    problematic_internet_use_anxiety = -1,
    community_engagement = 5,
    social_pressure = 2,
    recommendation_satisfaction = 5
WHERE full_question = 'Sharing personalized content helps me connect with others.';

-- 61. I sometimes feel pressure to share content that is trending on my feed
UPDATE survey.questions
SET life_satisfaction = 0,
    digital_self_regulation = -1,
    online_privacy_and_control = 0,
    emotional_resilience = -1,
    problematic_internet_use_anxiety = 1,
    community_engagement = 3,
    social_pressure = 5,
    recommendation_satisfaction = 4
WHERE full_question = 'I sometimes feel pressure to share content that is trending on my feed.';
