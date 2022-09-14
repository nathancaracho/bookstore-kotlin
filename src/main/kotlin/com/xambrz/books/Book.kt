package com.xambrz.books

import io.micronaut.core.annotation.Introspected
import io.micronaut.core.annotation.ReflectiveAccess
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@Introspected
data class Book(@Id private val id:Long,private val name:String)
