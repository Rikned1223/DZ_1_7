package com.example.sevenmonth.domain.usecases

import android.provider.ContactsContract.CommonDataKinds.Note
import com.example.sevenmonth.domain.repository.NoteRepository

class DeleteNoteUseCase(private val noteRepository: NoteRepository) {
    fun deleteNote(note: com.example.sevenmonth.domain.model.Note) = noteRepository.createNote(note)
}