package com.example.file_uploader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException; 
import java.nio.file.*;

@Controller
public class FileUploadController {
  
  @PostMapping("/upload")
  public String handleFileUpload(@RequestParam("file") MultipartFile file,
      RedirectAttributes redirectAttributes) {
    if (file.isEmpty()) {
      redirectAttributes.addFlashAttribute("message", "ファイルを選択してください。");
      return "redirect:/";
    }

    try {
      Path uploadDir = Paths.get("uploads");
      if (!Files.exists(uploadDir)) {
        Files.createDirectories(uploadDir);
      }
      Files.copy(file.getInputStream(), uploadDir.resolve(file.getOriginalFilename()),
              StandardCopyOption.REPLACE_EXISTING);

      redirectAttributes.addFlashAttribute("message", "アップロード成功: " + file.getOriginalFilename());
    } catch (IOException e) {
      redirectAttributes.addFlashAttribute("message", "アップロードに失敗しました。");
      e.printStackTrace();
    }

    return "redirect:/";
  }
}
