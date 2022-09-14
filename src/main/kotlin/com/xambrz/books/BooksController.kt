package com.xambrz.books

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/books")
class BooksController {
    @Get
    fun getBooks() = listOf(Book(123,"some thing"))
}