package sueprtizen.smartclothing.domain.outfit.recommended.service;

import sueprtizen.smartclothing.domain.outfit.recommended.dto.PastOutfitResponseDTO;

import java.util.List;

public interface RecommendedOutfitService {
    List<PastOutfitResponseDTO> pastOutfitConformation(int userId);
}
