package explain;

import java.util.Scanner;

public class EarthMain {
	static Scanner scan = new Scanner(System.in);
	static String userName;

	public static void main(String[] args) {
		System.out.println("사용자 명을 입력해주세요: ");
		userName = scan.nextLine();

		System.out.println("				*프로그램 설명*");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(userName + "님 안녕하세요.");
		System.out.println("지구에는 수많은 나라들이 존재하고 있습니다.");
		System.out.println("이 프로그램은 여러 국가에 대한 설명을 제공하는 프로그램입니다.");
		System.out.println("");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("계속 진행하시려면 엔터키를 눌러주세요.");
		String start = scan.nextLine();

		System.out.println("대륙을 선택하세요.");
		System.out.println("[1.아시아]");
		System.out.println("[2.유럽]");
		// System.out.println("[3.북아메리카]");
		// System.out.println("[4.남아메키라]");
		// System.out.println("[5.오세아니아]");
		// System.out.println("[6.아프리카]");
		System.out.println("번호 입력 : ");

		while (true) {

			int continent = scan.nextInt();
			System.out.println("번호 입력 : ");
			switch (continent) {

			case 1:
				ASIA();
				System.out.println("1.대한민국");
				System.out.println("2.중국");
				System.out.println("3.일본");
				String id1 = scan.next();

				if (id1.equals("1")) {
					System.out.println("-------------------대한민국에 대한 정보를 출력합니다.--------------------------");
					System.out.println();
					System.out.println(
							"동아시아의 한반도 남단에 자리한 민주공화국이다.\n서쪽으로 중화인민공화국과 황해를 사이에 두고, 동쪽으로 일본과 동해를 사이에 두고, 북쪽으로 조선민주주의인민공화국과 한반도 군사 분계선을 사이에 두고 맞닿아 있다.\n대한민국의 국기는 대한민국 국기법에 따라 태극기, 국가는 관습상 무궁화이다. 공용어는 한국어와 한국 수어이다.\n수도는 서울이다. 인구는 약 5,100만 100명으로 전체 인구 중 절반 정도가 수도권에 살고 있다.");
					System.out.println();
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("");
					System.out.println("대륙 선택화면으로 이동합니다.");
					System.out.println("[1.아시아]");
					System.out.println("[2.유럽]");
					continue;
				}

				if (id1.equals("2")) {
					System.out.println("-------------------중국에 대한 정보를 출력합니다.--------------------------");
					System.out.println();
					System.out.println(
							"국명의 약칭은 중국이고 중화라고 부르기도 한다. 그 밖에도 국외에서는 중공(중국 공산당의 약칭)이라고 부르기도 한다.\n수도는 베이징시이며, 최대 도시는 상하이시이다. 이밖의 주요 도시로는 광저우시, 난징시, 시안시, 푸저우시, 칭다오시, 충칭시 등이 있다.\n중국은 56개 민족이 있지만 대부분이 한족이다. 한족은 중국 전체 인구의 92%를 차지하고 있으며 그 외 55개의 소수 민족들이 8%를 차지하고 있다. 중국 전체의 인구는 2016년도 기준 약 13억 7437만명이다.");
					System.out.println();
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("");
					System.out.println("대륙 선택화면으로 이동합니다.");
					System.out.println("[1.아시아]");
					System.out.println("[2.유럽]");
					continue;
				}

				if (id1.equals("3")) {
					System.out.println("-------------------일본에 대한 정보를 출력합니다.--------------------------");
					System.out.println();
					System.out.println(
							"동아시아에 있는 국가로 태평양에 있는 일본 열도의 네 개의 큰 섬(혼슈, 규슈, 시코쿠, 훗카이도)과 이들 주변에 산재한 작은 섬들로 구성되어 있다.\n인구는 약 1억 2,600만 명으로 세계에서 11번째로 많다.");
					System.out.println();
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("");
					System.out.println("대륙 선택화면으로 이동합니다.");
					System.out.println("[1.아시아]");
					System.out.println("[2.유럽]");
					continue;
				} else {
					System.out.println("");
					System.out.println("잘못된 입력입니다.");
					System.out.println("다시 선택해 주세요.");
					System.out.println("대륙 선택화면으로 이동합니다.");
					System.out.println("[1.아시아]");
					System.out.println("[2.유럽]");
					continue;
				}
				
			case 2:
				EUROPE();
				System.out.println("1.독일");
				System.out.println("2.영국");
				System.out.println("3.프랑스");
				String id2 = scan.next();

				if (id2.equals("1")) {
					System.out.println("-------------------독일에 대한 정보를 출력합니다.--------------------------");
					System.out.println();
					System.out.println(
							"유럽 중부에 있는 나라로, 여러 개의 독립국이 1871년 프로이센-프랑스전쟁을 거쳐 독일제국으로 성립되었다.\n제2차 세계대전 후인 1949년 독일연방공화국(서독)과 독일민주공화국(동독)으로 나뉘었다가 1990년 통일되었다.\n인구는 2020년 기준 약 8378만 명으로 유럽 전체에서 러시아와 터키에 이어 세 번째인 인구대국이다.");
					System.out.println();
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("");
					System.out.println("대륙 선택화면으로 이동합니다.");
					System.out.println("[1.아시아]");
					System.out.println("[2.유럽]");
					continue;
				}

				if (id2.equals("2")) {
					System.out.println("-------------------영국에 대한 정보를 출력합니다.--------------------------");
					System.out.println();
					System.out.println(
							"유럽 대륙 서북쪽에 있는 섬나라로, 그레이트브리튼섬(잉글랜드, 스코틀랜드, 웨일스)과 아일랜드섬 북쪽의 북아일랜드로 이루어진다.\n1922년 아일랜드 자유국이 성립될 때 북아일랜드가 영국의 일부로 남음으로써 현재의 연합왕국이 되었다.\n정치적으로 입헌군주제를 시행하는 의회민주주의 국가이며, 전 세계에서 의원내각제가 가장 처음으로 시행된 나라이다.\n인구는 2020년 기준 약 6771만 명이다.");
					System.out.println();
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("");
					System.out.println("대륙 선택화면으로 이동합니다.");
					System.out.println("[1.아시아]");
					System.out.println("[2.유럽]");
					continue;
				}

				if (id2.equals("3")) {
					System.out.println("-------------------프랑스에 대한 정보를 출력합니다.--------------------------");
					System.out.println();
					System.out.println(
							"유럽 대륙의 서부, 지중해와 대서양 사이에 위치하며, 유럽에서 3번째로 큰 나라이다.\n987년 프랑크 왕국이 멸망하고 카페 왕조 창시로 최초의 국가가 형성되었다.\n절대왕정과 제정, 공화정을 반복하다가 1871년 공화정부 수립 이후 오늘에 이른다.\n국기의 구성은 청색, 백색, 적색 3개의 이루어진 삼색기이며 각각 자유, 평등, 박애를 상징한다.\n역사적으로나 문화적으로 서유럽에서 가장 주요한 역할을 해 온 국가 중 하나이다. 유럽의 대표적인 농업 생산국이기도 하다.\n인구는 2020년 기준 약 6784만 명이다.");
					System.out.println();
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("");
					System.out.println("대륙 선택화면으로 이동합니다.");
					System.out.println("[1.아시아]");
					System.out.println("[2.유럽]");
					continue;
				} else {
					System.out.println("");
					System.out.println("잘못된 입력입니다.");
					System.out.println("다시 선택해 주세요.");
					System.out.println("대륙 선택화면으로 이동합니다.");
					System.out.println("[1.아시아]");
					System.out.println("[2.유럽]");
					continue;
				}
				
			}
			break;
		}	

	}

	private static void EUROPE() {
		System.out.println("유럽에 속한 국가들의 목록을 출력합니다.");

	}

	private static void ASIA() {
		System.out.println("아시아에 속한 국가들의 목록을 출력합니다.");

	}
}
