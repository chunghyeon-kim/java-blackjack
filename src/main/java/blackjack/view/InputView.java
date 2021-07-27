package blackjack.view;

import blackjack.dto.PlayersNameInputDto;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    private PlayersNameInputDto getPlayersName() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        String input = scanner.nextLine();
        return new PlayersNameInputDto(input);
    }


}
