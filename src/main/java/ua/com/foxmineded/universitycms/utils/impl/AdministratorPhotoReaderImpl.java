package ua.com.foxmineded.universitycms.utils.impl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.stereotype.Component;
import lombok.SneakyThrows;
import ua.com.foxmineded.universitycms.utils.AdministratorPhotoReader;

@Component
public class AdministratorPhotoReaderImpl implements AdministratorPhotoReader {
	private static final Path ADMINISTRATOR_PHOTO_PATH = Paths
			.get("src", "main", "resources", "static", "photo",
			"administrator.png");

	@SneakyThrows
	@Override
	public byte[] readPng() {
		return Files.readAllBytes(ADMINISTRATOR_PHOTO_PATH);
	}
}
