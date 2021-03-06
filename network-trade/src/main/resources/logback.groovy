appender("FILE", FileAppender) {
    file = "network-trade.log"
    append = false
    encoder(PatternLayoutEncoder) {
        pattern = "[%date{HH:mm:ss.SSS}] %logger{35} @ %level - %msg%n"
    }
}

appender("STDOUT", ConsoleAppender) {
    withJansi = true
    encoder(PatternLayoutEncoder) {
        pattern = "[%red(%date{HH:mm:ss.SSS})] %highlight(%-5level) %cyan(%logger{15}) - %msg %n"
    }
}


root(DEBUG, ["FILE"])
root(INFO, ["STDOUT"])
