package com.example.sevenmonth.domain.usecases

import com.example.sevenmonth.domain.model.Note
import com.example.sevenmonth.domain.repository.NoteRepository

class EditNoteUseCase(private val noteRepository: NoteRepository) {
    fun editNote(note: Note) = noteRepository.editNote(note)
}