package sec1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdderTest {

    // トリプルA原則大事
    // アレンジ→テストデータ簿準備
    // アクト→実行
    // アザート→期待値確認

    @Test // アノテーション
    void testAdd(){
        // arrange
        Adder adder = new Adder();

        // act
        int actual = adder.add(1,2);

        // assert
        assertEquals(3, actual);
    }
}