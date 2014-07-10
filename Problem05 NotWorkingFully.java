/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? */


public class SmallestMultiple {
	public static int value = 0;
	public static void main(String[] args) {
		SmallestMultiple Mult = new SmallestMultiple();
		System.out.println(Mult.mult(205000));
}

	public int mult(int i){
				boolean k = false;
				
				while(k == false){
					if(i % 20 == 0){
						if (i % 19 == 0){
							if (i % 18 == 0){
								if (i % 17 == 0){
									if(i % 16 == 0){
										if(i % 15 == 0){
											if(i % 14 == 0){
												if(i % 13 == 0){
													if(i % 12 == 0){
														if(i % 11 == 0){
															System.out.println(i);
															k = true;
															value = i;
														}else{++i; mult(i);}
													}else{++i; mult(i);}
												}else{++i; mult(i);}
											}else{++i;mult(i);}
										}else{++i;  mult(i);}
									}else{++i;  mult(i);}
								}else{++i;  mult(i);}
							}else{++i;  mult(i);}
						}else{++i;  mult(i);}
					}else{++i; mult(i);}
			}
return value;
}
}

