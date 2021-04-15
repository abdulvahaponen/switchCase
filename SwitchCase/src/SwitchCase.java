
public class SwitchCase {
	public static void main(String[] args) {
	//seçilen ay deðeri
		int ayDegeri=7;
	String ayDegeriStr=null;
	switch (ayDegeri) {
	case 1:
		ayDegeriStr="Ocak";
		break;
		case 2:
			ayDegeriStr="Þubat";
			break;
			case 3:
				ayDegeriStr="MArt";
				break;
				case 4:
				ayDegeriStr="Nisan";
				break;
				case 5:
					ayDegeriStr="Mayýs";
					break;
					case 6:
						ayDegeriStr="haziran";
						break;
						case 7:
							ayDegeriStr="Temmuz";
							case 8:
								ayDegeriStr="Aðustos";
								break;
								case 9:
									ayDegeriStr="Eylül";
								break;
								case 10:
									ayDegeriStr="Ekim";
									break;
									case 11:
										ayDegeriStr="kasým";
										break;
										case 12:
											ayDegeriStr="Aralýk";
											break;
							default:
								break;
	}
	System.out.println("seçilen ay deðeri:"+ayDegeriStr);
}
}
