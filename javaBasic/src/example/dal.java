package example;

public class dal {
		
	public static void main(String[] args) {
//  1 20 19 18 17 16
//  2 21 32 31 30 15
//  3 22 33 36 29 14
//  4 23 34 35 28 13
//  5 24 25 26 27 12
//  6  7  8  9 10 11

			
			int n = 6;
			int array[][] = new int[n][n];
			
			
			int x = 0;
	        int y = 0;
	        int number = 1;
	        int f = n;
	                
	        for (int i = 0; i < 2 * n - 1; i++) { // 총 2*n-1 번 진행 함 //for 반복문
	            switch (i % 4) { // 4방향으로 움직일때 나머지가 n이면 방향 지정
	                case 0: // 아래쪽 이동
	                    for (int k = 0; k < f ;k++) {
	                        array[y][x] = number;
	                        y++;
	                        number++;
	                    }
	                    y--; //위에서 y값이 1증가해버리면 7까지 가버리기 때문에 원상복구용
	                    x++; //시작시 1에서 시작이 아닌 2로 시작하기 때문에 반복문 후 +1해주는 것
	                    f--; //다음 방향일때 -1씩 진행해야 하기 때문에 감소
	                    break;
	                case 1: // 오른쪽 이동
	                    for (int k = 0; k < f ;k++) {
	                        array[y][x] = number;
	                        x++;
	                        number++;
	                    }
	                    x--;
	                    y--;
	                    break;
	                case 2:  // 위쪽 이동
	                    for (int k = 0; k < f ;k++) {
	                        array[y][x] = number;
	                        y--;
	                        number++;
	                    }
	                    y++;
	                    x--;
	                    f--;
	                    break;
	                case 3:  // 왼쪽 이동
	                    for (int k = 0; k < f ;k++) {
	                        array[y][x] = number;
	                        x--;
	                        number++;
	                    }
	                    x++;
	                    y++;
	                    break;
				}
			}
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n ; j++){
					System.out.printf("%3d", array[i][j]);
				}
				System.out.println();
			}
		
		}
	}