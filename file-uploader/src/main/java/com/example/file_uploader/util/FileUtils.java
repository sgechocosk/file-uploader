// package com.example.file_uploader.util;

// import java.security.SecureRandom;
// import java.util.UUID;

// public class FileUtils {
    
//     private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
//     private static final SecureRandom random = new SecureRandom();
    
//     /**
//      * ランダムなダウンロードパスワードを生成
//      * @param length パスワードの長さ
//      * @return 生成されたパスワード
//      */
//     public static String generateDownloadPassword(int length) {
//         StringBuilder password = new StringBuilder(length);
//         for (int i = 0; i < length; i++) {
//             password.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
//         }
//         return password.toString();
//     }
    
//     /**
//      * 一意なファイル名を生成（UUID + 拡張子）
//      * @param originalFilename 元のファイル名
//      * @return 一意なファイル名
//      */
//     public static String generateUniqueFileName(String originalFilename) {
//         String extension = "";
//         if (originalFilename != null && originalFilename.contains(".")) {
//             extension = originalFilename.substring(originalFilename.lastIndexOf("."));
//         }
//         return UUID.randomUUID().toString() + extension;
//     }
    
//     /**
//      * ファイルサイズを人間が読みやすい形式に変換
//      * @param bytes バイト数
//      * @return 読みやすい形式の文字列
//      */
//     public static String formatFileSize(long bytes) {
//         if (bytes < 1024) return bytes + " B";
//         int exp = (int) (Math.log(bytes) / Math.log(1024));
//         String pre = "KMGTPE".charAt(exp - 1) + "";
//         return String.format("%.1f %sB", bytes / Math.pow(1024, exp), pre);
//     }
// }
