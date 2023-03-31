package com.example.sevenmonth.data.repository

import com.example.sevenmonth.data.local.NoteDao
import com.example.sevenmonth.data.mapper.toEntity
import com.example.sevenmonth.data.mapper.toNote
import com.example.sevenmonth.data.model.NoteEntity
import com.example.sevenmonth.domain.model.Note
import com.example.sevenmonth.domain.repository.NoteRepository

class NoteRepositoryImpl(
    private val noteDao: NoteDao
) : NoteRepository {

    override fun createNote(note: Note) {
        noteDao.createNote(note.toEntity())
    }

    override fun getAllNotes(): List<Note> {

        return noteDao.getAllNotes().map {
            it.toNote()
        }
    }

    override fun editNote(note: Note) {
        noteDao.editNote(note.toEntity())
    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNote(note.toEntity())

    }
}