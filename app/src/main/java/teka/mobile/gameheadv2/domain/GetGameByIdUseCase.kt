package teka.mobile.gameheadv2.domain

import teka.mobile.gameheadv2.domain.items.SpecificGameItem
import teka.mobile.gameheadv2.repo.GameRepository
import javax.inject.Inject

class GetGameByIdUseCase @Inject constructor(private val gameRepository: GameRepository) {

    suspend operator fun invoke(id: Int): SpecificGameItem {

        return gameRepository.getGameById(id)

    }
}