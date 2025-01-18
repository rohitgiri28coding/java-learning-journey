
                            num[j-1] = (float)Math.pow(num[j-1], 0.5);
                            f=0;
                            break loop;
                    }
                    if(f==1){                       
                        temp += (Character.getNumericValue(ch)*Math.pow(10, l));
                        l--;
                    }
                    else{
                        temp = temp*10 + Character.get