package org.example.toworkspring.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.toworkspring.repositories.AchievementRepository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AchievementService {
    private final AchievementRepository achievementRepository;
    public boolean getAchievement() {
        return achievementRepository.findByName("First Achievement") != null;
    }
}
