package com.example.sunflower.app.photo.data.logic

import com.example.sunflower.app.photo.data.data.PhotoEntity
import com.example.sunflower.core.db.photo.PhotoRepository
import javax.inject.Inject


class PhotoLogic @Inject constructor(
    private val dbRepository: PhotoRepository
) {
    suspend fun insertPhoto(photoEntity: PhotoEntity) {
        dbRepository.insertPhotoInfo(photoEntity)
    }

    suspend fun getAllPhoto(): List<PhotoEntity> {
        return dbRepository.getAllPhotoInfo()
    }

    suspend fun delete(photo: PhotoEntity) {
        dbRepository.delete(photo.id)
    }
}