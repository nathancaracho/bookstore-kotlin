package com.xambrz

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

@Controller("/xambraboookstore")
class XambraboookstoreController {

    @Get(uri = "/", produces = ["text/plain"])
    fun index(): String {
        return "Example Response"
    }
}