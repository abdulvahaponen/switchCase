
public class SwitchCase {
	public static void main(String[] args) {
	//se�ilen ay de�eri
		int ayDegeri=7;
	String ayDegeriStr=null;
	switch (ayDegeri) {
	case 1:
		ayDegeriStr="Ocak";
		break;
		case 2:
			ayDegeriStr="�ubat";
			break;
			case 3:
				ayDegeriStr="MArt";
				break;
				case 4:
				ayDegeriStr="Nisan";
				break;
				case 5:
					ayDegeriStr="May�s";
					break;
					case 6:
						ayDegeriStr="haziran";
						break;
						case 7:
							ayDegeriStr="Temmuz";
							case 8:
								ayDegeriStr="A�ustos";
								break;
								case 9:
									ayDegeriStr="Eyl�l";
								break;
								case 10:
									ayDegeriStr="Ekim";
									break;
									case 11:
										ayDegeriStr="kas�m";
										break;
										case 12:
											ayDegeriStr="Aral�k";
											break;
							default:
								break;
	}
	System.out.println("se�ilen ay de�eri:"+ayDegeriStr);
}
}
