package org.oberon.oss.chess.base.position;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.oberon.oss.chess.base.ChessColor;
import org.oberon.oss.chess.base.board.Board;
import org.oberon.oss.chess.base.field.FieldInformation;

/**
 * Describes a position in a chess game.
 *
 * @author Fabien H. Dumay
 * @since 1.0.0
 */
@SuppressWarnings("unused")
@Getter
@Builder(builderClassName = "ChessPositionBuilder")
@Accessors(fluent = true)
@EqualsAndHashCode
public class PositionImpl implements Position<FieldInformation> {
    private final Board<FieldInformation> board;
    private final ChessColor              sideToMove;
    private final FieldInformation        enPassantField;
    private final boolean                 whiteCanCastleKingSide;
    private final boolean                 whiteCanCastleQueenSide;
    private final boolean                 blackCanCastleKingSide;
    private final boolean                 blackCanCastleQueenSide;

    @SuppressWarnings("java:S2094") // Prevent javadoc complaining about missing builders
    public static final class ChessPositionBuilder {
    }
}
