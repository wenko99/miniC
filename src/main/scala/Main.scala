package miniC

object Main extends App with miniCDriver {
    //run("input(x); y := x")
    run("""
        x := 0;
        y := 0;
        while(x < 10) {
            y := y + x;
            x := x + 1
        }
    """)
    // run("""
    //     x := 5;
    //     y := 1;
    //     while(x < 10) {
    //         if(y == 2) {
    //             y := 4
    //         } else {
    //             y := 3
    //         };
    //         x := x + y
    //     }
    // """)
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
