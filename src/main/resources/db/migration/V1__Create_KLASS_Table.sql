CREATE TABLE `klass` (
  `id`                 BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `created_date` TIMESTAMP DEFAULT NOW(),
  `grade`             BIGINT
);
