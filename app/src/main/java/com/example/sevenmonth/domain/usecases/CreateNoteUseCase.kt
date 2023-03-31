package com.example.sevenmonth.domain.usecases

import com.example.sevenmonth.domain.model.Note
import com.example.sevenmonth.domain.repository.NoteRepository

class CreateNoteUseCase(private val noteRepository: NoteRepository) {

    fun createNote(note: Note) = noteRepository.createNote(note)
}