// package com.example.file_uploader.entity;

// import jakarta.persistence.*;
// import java.time.LocalDateTime;

// @Entity
// @Table(name = "uploaded_files")
// public class UploadedFile {
    
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
    
//     @Column(nullable = false)
//     private String originalName;
    
//     @Column(nullable = false, unique = true)
//     private String storedName;
    
//     @Column(nullable = false, unique = true)
//     private String downloadPassword;
    
//     @Column(nullable = false)
//     private LocalDateTime uploadTime;
    
//     @Column(nullable = false)
//     private LocalDateTime expiryTime;
    
//     @Column(nullable = false)
//     private Long fileSize;
    
//     // デフォルトコンストラクタ
//     public UploadedFile() {}
    
//     // コンストラクタ
//     public UploadedFile(String originalName, String storedName, String downloadPassword, 
//                        LocalDateTime uploadTime, LocalDateTime expiryTime, Long fileSize) {
//         this.originalName = originalName;
//         this.storedName = storedName;
//         this.downloadPassword = downloadPassword;
//         this.uploadTime = uploadTime;
//         this.expiryTime = expiryTime;
//         this.fileSize = fileSize;
//     }
    
//     // Getter and Setter methods
//     public Long getId() {
//         return id;
//     }
    
//     public void setId(Long id) {
//         this.id = id;
//     }
    
//     public String getOriginalName() {
//         return originalName;
//     }
    
//     public void setOriginalName(String originalName) {
//         this.originalName = originalName;
//     }
    
//     public String getStoredName() {
//         return storedName;
//     }
    
//     public void setStoredName(String storedName) {
//         this.storedName = storedName;
//     }
    
//     public String getDownloadPassword() {
//         return downloadPassword;
//     }
    
//     public void setDownloadPassword(String downloadPassword) {
//         this.downloadPassword = downloadPassword;
//     }
    
//     public LocalDateTime getUploadTime() {
//         return uploadTime;
//     }
    
//     public void setUploadTime(LocalDateTime uploadTime) {
//         this.uploadTime = uploadTime;
//     }
    
//     public LocalDateTime getExpiryTime() {
//         return expiryTime;
//     }
    
//     public void setExpiryTime(LocalDateTime expiryTime) {
//         this.expiryTime = expiryTime;
//     }
    
//     public Long getFileSize() {
//         return fileSize;
//     }
    
//     public void setFileSize(Long fileSize) {
//         this.fileSize = fileSize;
//     }
    
//     // 有効期限チェック用メソッド
//     public boolean isExpired() {
//         return LocalDateTime.now().isAfter(this.expiryTime);
//     }
// }
