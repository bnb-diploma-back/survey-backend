-- Insert sections into survey.sections
INSERT INTO survey.sections (uuid, category, title)
VALUES
    (gen_random_uuid(), 'DIGITAL_CONSUMPTION', 'Digital Consumption'),
    (gen_random_uuid(), 'PERCEPTION_EVALUATION', 'Perception Evaluation'),
    (gen_random_uuid(), 'PERSONAL_FOCUS_AND_WELL_BEING', 'Personal Focus and Well-being'),
    (gen_random_uuid(), 'INTERNET_USAGE_FREQUENCY', 'Internet Usage Frequency'),
    (gen_random_uuid(), 'DISCUSSION_AND_SHARING_BEHAVIOR', 'Discussion and Sharing Behavior');

-- Section 1: DIGITAL_CONSUMPTION (id = 1)
INSERT INTO survey.questions (uuid, full_question, section_id, life_satisfaction, digital_self_regulation, online_privacy_and_control, emotional_resilience, problematic_internet_use_anxiety, community_engagement, social_pressure, recommendation_satisfaction)
VALUES
    (gen_random_uuid(), 'I intentionally set limits on my screen use.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I can control how much time I spend on screens.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I often lose track of time while using screens.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I am ready to be responsible for the negative outcomes caused by my screen use.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'My screen use supports my personal or professional goals.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'Screen time distracts me from important tasks.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I use digital technologies mainly for purposeful activities.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I feel that my actions matter in online communities.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I can positively influence others in digital spaces.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I feel powerless in online environments.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I feel supported when people interact with me online.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'Online connections help me during difficult times.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'Improper behavior by others online stresses or annoys me.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I feel good when people online behave respectfully.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I appreciate it when users consider appropriateness before sharing content.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'Respectful behavior online makes digital spaces enjoyable.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'Online spaces often feel hostile or disrespectful.', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- Section 2: PERCEPTION_EVALUATION (id = 2)
INSERT INTO survey.questions (uuid, full_question, section_id, life_satisfaction, digital_self_regulation, online_privacy_and_control, emotional_resilience, problematic_internet_use_anxiety, community_engagement, social_pressure, recommendation_satisfaction)
VALUES
    (gen_random_uuid(), 'In most ways my life is close to my ideal.', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'The conditions of my life are excellent.', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I am satisfied with my life.', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'So far I have gotten the important things I want in life.', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'If I could live my life over, I would change almost nothing.', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I feel in control over the information I provide on social networking sites.', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'Privacy settings allow me to have full control over the information I provide on social networking sites.', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I feel in control of who can view my information on social networking sites.', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I am very attached to my online communities (e.g., forums, social media groups, online games).', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'Other members of my online communities and I share the same objectives.', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'The friendships I have with other online community members mean a lot to me.', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I see myself as part of my online communities.', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I am motivated to participate in the online community''s activities because I am able to reach personal goals.', 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- Section 3: PERSONAL_FOCUS_AND_WELL_BEING (id = 3)
INSERT INTO survey.questions (uuid, full_question, section_id, life_satisfaction, digital_self_regulation, online_privacy_and_control, emotional_resilience, problematic_internet_use_anxiety, community_engagement, social_pressure, recommendation_satisfaction)
VALUES
    (gen_random_uuid(), 'It is easy for me to concentrate on what I am doing.', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I can tolerate emotional pain.', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I can accept things I cannot change.', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I can usually describe how I feel at the moment in considerable detail.', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'It''s easy for me to keep track of my thoughts and feelings.', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I try to notice my thoughts without judging them.', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I am able to accept the thoughts and feelings I have.', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I am able to focus on the present moment.', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I am able to pay close attention to one thing for a long period of time.', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I''ve been feeling optimistic about the future.', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I''ve been feeling useful.', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I''ve been feeling relaxed.', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I''ve been dealing with problems well.', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I''ve been thinking clearly.', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I''ve been feeling close to other people.', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I''ve been able to make up my own mind about things.', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- Section 4: INTERNET_USAGE_FREQUENCY (id = 4)
INSERT INTO survey.questions (uuid, full_question, section_id, life_satisfaction, digital_self_regulation, online_privacy_and_control, emotional_resilience, problematic_internet_use_anxiety, community_engagement, social_pressure, recommendation_satisfaction)
VALUES
    (gen_random_uuid(), 'I spend time online when I''d rather sleep.', 4, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I feel tense, irritated, or stressed if I cannot use the Internet as long as I want to.', 4, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I wish to decrease the amount of time spent online but do not succeed.', 4, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I try to conceal the amount of time spent online.', 4, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'People in my life complain about me spending too much time online.', 4, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I feel depressed, moody, or nervous when I am not online, and these feelings stop once I am back online.', 4, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- Section 5: DISCUSSION_AND_SHARING_BEHAVIOR (id = 5)
INSERT INTO survey.questions (uuid, full_question, section_id, life_satisfaction, digital_self_regulation, online_privacy_and_control, emotional_resilience, problematic_internet_use_anxiety, community_engagement, social_pressure, recommendation_satisfaction)
VALUES
    (gen_random_uuid(), 'The videos/posts recommended to me usually match my interests.', 5, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'My recommended feed helps me discover new and useful information.', 5, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I feel bored when the recommendations become repetitive.', 5, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I believe my recommended feed improves my overall social media experience.', 5, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I often share recommended videos/posts with my friends.', 5, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'My friends and I often discuss the content we see on our feeds.', 5, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'We compare how similar or different our feeds are.', 5, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'Sharing personalized content helps me connect with others.', 5, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (gen_random_uuid(), 'I sometimes feel pressure to share content that is trending on my feed.', 5, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
