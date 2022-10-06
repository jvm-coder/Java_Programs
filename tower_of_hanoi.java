// JAVA recursive function to
// solve tower of hanoi puzzle
import java.util.*;
import java.io.*;
import java.math.*;
class GFG
{
static void towerOfHanoi(int n, char from_rod,
                    char to_rod, char aux_rod)
{
    if (n == 1)
    {
        System.out.println("Move disk 1 from rod "+
                           from_rod+" to rod "+to_rod);
        return;
    }
    towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
    System.out.println("Move disk "+ n + " from rod " +
                       from_rod +" to rod " + to_rod );
    towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
}
 
// Driver code
public static void  main(String args[])
{
    int n = 4; // Number of disks
    towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
}
}


/*
-- Output --
Move disk 1 from rod A to rod B
Move disk 2 from rod A to rod C
Move disk 1 from rod B to rod C
Move disk 3 from rod A to rod B
Move disk 1 from rod C to rod A
Move disk 2 from rod C to rod B
Move disk 1 from rod A to rod B
Move disk 4 from rod A to rod C
Move disk 1 from rod B to rod C
Move disk 2 from rod B to rod A
Move disk 1 from rod C to rod A
Move disk 3 from rod B to rod C
Move disk 1 from rod A to rod B
Move disk 2 from rod A to rod C
Move disk 1 from rod B to rod C

*/

/*
-- Output --

Tower of Hanoi Solution for 4 disks:

A: [4, 3, 2, 1] B: [] C: []

Move disk from rod A to rod B
A: [4, 3, 2] B: [1] C: []

Move disk from rod A to rod C
A: [4, 3] B: [1] C: [2]

Move disk from rod B to rod C
A: [4, 3] B: [] C: [2, 1]

Move disk from rod A to rod B
A: [4] B: [3] C: [2, 1]

Move disk from rod C to rod A
A: [4, 1] B: [3] C: [2]

Move disk from rod C to rod B
A: [4, 1] B: [3, 2] C: []

Move disk from rod A to rod B
A: [4] B: [3, 2, 1] C: []

Move disk from rod A to rod C
A: [] B: [3, 2, 1] C: [4]

Move disk from rod B to rod C
A: [] B: [3, 2] C: [4, 1]

Move disk from rod B to rod A
A: [2] B: [3] C: [4, 1]

Move disk from rod C to rod A
A: [2, 1] B: [3] C: [4]

Move disk from rod B to rod C
A: [2, 1] B: [] C: [4, 3]

Move disk from rod A to rod B
A: [2] B: [1] C: [4, 3]

Move disk from rod A to rod C
A: [] B: [1] C: [4, 3, 2]

Move disk from rod B to rod C
A: [] B: [] C: [4, 3, 2, 1]
*/
