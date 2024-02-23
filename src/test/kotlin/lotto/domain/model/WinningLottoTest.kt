package lotto.domain.model

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class WinningLottoTest {

    @Test
    fun `보너스 번호가 로또 번호와 중복될 때 예외를 던진다`() {
        val exception = assertThrows<IllegalArgumentException> {
            WinningLotto(
                Lotto(List(6) { LottoNumber(it + 1) }),
                LottoNumber(1)
            )
        }
        Assertions.assertThat(exception.message).isEqualTo("보너스 번호는 당첨번호와 중복되면 안됩니다.")
    }
}
