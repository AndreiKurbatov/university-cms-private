package ua.com.foxmineded.universitycms.utils.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import ua.com.foxmineded.universitycms.utils.CoursesNamesReader;

@Component
public class CoursesNamesReaderImpl implements CoursesNamesReader {
    @Value("classpath:txt/computer-science-courses.txt")
    private Resource resourceComputerScienceCourses;
    @Value("classpath:txt/art-courses.txt")
    private Resource resourceArtCourses;
    @Value("classpath:txt/economic-courses.txt")
    private Resource resourceEconomicCourses;
    @Value("classpath:txt/medicine-courses.txt")
    private Resource resourceMedicineCourses;


    @Override
    public List<String> readEconomicCourses() throws IOException {
        try (InputStream inputStream = resourceEconomicCourses.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            List<String> lines = reader.lines().collect(Collectors.toList());
            return lines;
        }
    }

    @Override
    public List<String> readComputerScienceCourses() throws IOException {
        try (InputStream inputStream = resourceComputerScienceCourses.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            List<String> lines = reader.lines().collect(Collectors.toList());
            return lines;
        }
    }

    @Override
    public List<String> readMedicineCourses() throws IOException {
        try (InputStream inputStream = resourceMedicineCourses.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            List<String> lines = reader.lines().collect(Collectors.toList());
            return lines;
        }
    }

    @Override
    public List<String> readArtCourses() throws IOException {
        try (InputStream inputStream = resourceArtCourses.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            List<String> lines = reader.lines().collect(Collectors.toList());
            return lines;
        }
    }
}
