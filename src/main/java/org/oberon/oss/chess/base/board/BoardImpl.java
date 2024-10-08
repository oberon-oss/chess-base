package org.oberon.oss.chess.base.board;

import lombok.*;
import lombok.experimental.Accessors;
import org.oberon.oss.chess.base.Piece;
import org.oberon.oss.chess.base.field.FieldInformation;

import java.util.Map;

/**
 * default implementation of the {@link Board} interface
 *
 * @author Fabien H. Dumay
 * @since 1.0.0
 */

@Builder(builderClassName = "ChessBoardBuilder")
@Getter
@Accessors(fluent = true)
@EqualsAndHashCode
@AllArgsConstructor
@SuppressWarnings({"ClassCanBeRecord", "unused"})
public class BoardImpl implements Board<FieldInformation> {
    @Singular("addToPieceMapping")
    private final Map<FieldInformation, Piece> pieceMapping;

    /**
     * Placeholder for the builder class as constructed by the @Builder annotation of the BoardImpl class. Its main purpose is to
     * prevent javadoc generators from reporting errors about missing builders.
     *
     * @since 1.0.0
     */
    @SuppressWarnings({"java:S2094", "unused"}) // Prevent javadoc complaining about missing builders
    public static class ChessBoardBuilder {
    }
}
