// Last updated: 9/8/2026, 6:28:14 PM
1class ParkingSystem {
2
3    int big; int medium;
4    int small;
5
6    public ParkingSystem(int big, int medium, int small) {
7        this.big = big;
8        this.medium = medium;
9        this.small = small;
10    }
11    
12    public boolean addCar(int carType) {
13        if(carType == 1){
14            if(big > 0){
15                big--; return true;
16            }
17        }
18
19        else if(carType == 2){
20            if(medium > 0){
21                medium--;
22                return true;
23            }
24        }
25
26        else{
27            if(small > 0){
28                small--;
29                return true;
30            }
31        }
32        return false;
33    }
34}
35
36/**
37 * Your ParkingSystem object will be instantiated and called as such:
38 * ParkingSystem obj = new ParkingSystem(big, medium, small);
39 * boolean param_1 = obj.addCar(carType);
40 */