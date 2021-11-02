package example;

public class Split_String {

	public static void main(String[] args) {
		// 문자열.Split(" ") => 문자열을 공백(space)으로 쪼개서 배열로 리턴
		String text1 = "Code readability is a big thing. Developers spend a lot of our time reading code: other peoples code, our own code, code we have never seen before, etc. Writing code in a way that is as readable as possible can help save everyone on your team a lot of time. Readability can sometimes be a bit of a trade off with performance, but I try to stay on the readable side as often as possible.";
		String text2 = "요소 도구 외에 콘솔이 브라우저 개발자 도구에서 가장 많이 사용되는 부분임에는 의심의 여지가 없습니다. 특히 사람들은 코드에 'console.log()'를 넣어 디버그하는 것을 좋아하여 무슨 일이 일어나고 있는지 알아봅니다. 여기에는 몇 가지 문제가 있으며 스크립트를 디버그하는 더 좋은 방법이 있지만 이것이 사람들이 하는 일이므로 해당 경험을 더 좋게 만드는 방법에 대해 이야기해 보겠습니다. 첫 번째 문제는 제품이 콘솔을 막히게 할 때 제거되지 않는 로그 메시지입니다. 당신이 찾고 있는 정보를 찾는 것은 벅찬 일이며 그것을 다루는 가장 좋은 방법은 사용 가능한 콘솔 필터링 옵션 에 대해 배우는 것 입니다. 이를 사용하여 콘솔의 보고를 관심 있는 항목으로 필터링하고 많은 소음을 차단할 수 있습니다.";
		
		String[] words = text1.split("[^a-zA-Z]+"); // 정규표현식[] ^시작문자

		for (String w : words) {
			if (w.length() < 2)
				continue; // 한 철자 이하는 빼기

			System.out.println(w.toLowerCase()); // 전부 소문자로 출력
		}

	}

}
