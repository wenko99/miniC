package miniC

object Main extends App with MiniCDriver {
    //run("x := 3; y := x")
    run("""
        x := 5;
        y := 1;
        while(x < 10) {
            if(y == 2) {
                y := 4
            } else {
                y := 3
            };
            x := x + y
        }
    """)
}
