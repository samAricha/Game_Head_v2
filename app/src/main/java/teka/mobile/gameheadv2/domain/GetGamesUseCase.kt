package teka.mobile.gameheadv2.domain

import teka.mobile.gameheadv2.domain.items.GameItem
import teka.mobile.gameheadv2.repo.GameRepository
import javax.inject.Inject

class GetGamesUseCase @Inject constructor(private val gameRepository: GameRepository) {

    suspend operator fun invoke(): List<GameItem> {

        return gameRepository.getGames().shuffled()

    }
}