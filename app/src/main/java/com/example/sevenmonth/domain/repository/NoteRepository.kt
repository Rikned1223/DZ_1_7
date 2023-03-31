package com.example.sevenmonth.domain.repository

import com.example.sevenmonth.domain.model.Note

interface NoteRepository {
    fun createNote(note: Note)

    fun getAllNotes(): List<Note>

    fun editNote(note: Note)

    fun deleteNote(note: Note)
}