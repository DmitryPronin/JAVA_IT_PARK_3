package ru.itpark.probro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.probro.models.FileInfo;

public interface FilesInfoRepository extends JpaRepository<FileInfo, Long>{
    FileInfo findOneByStorageName(String fileName);
    FileInfo findOneByUserId(Long user_id);
}
