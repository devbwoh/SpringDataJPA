package kr.ac.kumoh.ce.s20240000.mysqldb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MysqlDbApplication

fun main(args: Array<String>) {
	runApplication<MysqlDbApplication>(*args)
}
