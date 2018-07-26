CREATE TABLE `leader` (
  `id`                 BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `name`               VARCHAR(20),
  `klass_id`           BIGINT,
  `created_date` TIMESTAMP DEFAULT NOW()
);
