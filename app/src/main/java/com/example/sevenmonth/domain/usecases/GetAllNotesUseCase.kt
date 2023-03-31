package com.example.sevenmonth.domain.usecases

import com.example.sevenmonth.domain.model.Note
import com.example.sevenmonth.domain.repository.NoteRepository

class GetAllNotesUseCase(private val noteRepository: NoteRepository) {

    fun getAllNotes(note: Note) = noteRepository.getAllNotes()
}