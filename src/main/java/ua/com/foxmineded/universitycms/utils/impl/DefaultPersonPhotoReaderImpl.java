package ua.com.foxmineded.universitycms.utils.impl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.stereotype.Component;
import lombok.SneakyThrows;
import ua.com.foxmineded.universitycms.utils.DefaultPersonPhotoReader;

@Component
public class DefaultPersonPhotoReaderImpl implements DefaultPersonPhotoReader {
	private static final Path DEFAULT_PERSON_PHOTO_PATH = Paths.get("src", "main", "resources", "static", "photo",
			"default-person-photo.png");

	@SneakyThrows
	public static byte[] readPng() {
		return Files.readAllBytes(DEFAULT_PERSON_PHOTO_PATH);
	}
}
