package com.example.sevenmonth.data.mapper

import com.example.sevenmonth.data.model.NoteEntity
import com.example.sevenmonth.domain.model.Note

fun Note.toEntity() = NoteEntity(
    id, title, description
)

fun NoteEntity.toNote() = Note(
    id, title, description
)