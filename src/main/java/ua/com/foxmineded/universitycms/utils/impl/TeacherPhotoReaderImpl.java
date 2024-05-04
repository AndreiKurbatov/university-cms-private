package ua.com.foxmineded.universitycms.utils.impl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Component;

import lombok.SneakyThrows;
import ua.com.foxmineded.universitycms.utils.TeacherPhotoReader;

@Component
public class TeacherPhotoReaderImpl implements TeacherPhotoReader {
	private static final Path TEACHER_MAN_PHOTO_PATH = Paths.get("src", "main", "resources", "static", "photo",
			"teacher-man.png");
	private static final Path TEACHER_WOMAN_PHOTO_PATH = Paths.get("src", "main", "resources", "static", "photo",
			"teacher-woman.png");

	@SneakyThrows
	@Override
	public byte[] readManPng() {
		return Files.readAllBytes(TEACHER_MAN_PHOTO_PATH);
	}

	@SneakyThrows
	@Override
	public byte[] readWomanPng() {
		return Files.readAllBytes(TEACHER_WOMAN_PHOTO_PATH);
	}
}
