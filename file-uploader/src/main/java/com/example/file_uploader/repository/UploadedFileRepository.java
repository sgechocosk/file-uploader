// package com.example.file_uploader.repository;

// import com.example.file_uploader.entity.UploadedFile;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;

// import java.time.LocalDateTime;
// import java.util.Optional;

// @Repository
// public interface UploadedFileRepository extends JpaRepository<UploadedFile, Long> {
    
//     // パスワードでファイル検索
//     Optional<UploadedFile> findByDownloadPassword(String downloadPassword);
    
//     // 期限切れファイルの削除用クエリ
//     @Modifying
//     @Transactional
//     @Query("DELETE FROM UploadedFile u WHERE u.expiryTime < :now")
//     void deleteExpiredFiles(LocalDateTime now);
    
//     // 期限切れファイル取得用（物理ファイル削除のため）
//     @Query("SELECT u FROM UploadedFile u WHERE u.expiryTime < :now")
//     java.util.List<UploadedFile> findExpiredFiles(LocalDateTime now);
// }
