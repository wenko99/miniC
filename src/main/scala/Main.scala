package miniC

object Main extends App with miniCDriver {
    Grammar.genTest()
    Tester.start()
    /*
    run("""
        x := 5;
        y := 1;
        while(x < 100) {
            if(y == 2) {
                y := 4
            } else {
                y := 3
            };
            x := x + y
        }
    """)*/
    /*
    run("""
        x := 5;
        y := 1;
        while(x < 10) {
            if(y == 2) {
                y := 4
            } else {
                y := 3
            }
        }
    """)
    */
}
