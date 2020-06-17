package com.techlabs.model;

public class ResultAnalyzer {
	private int noOfturns = 0;
	private Board board;
	private ResultType result;
	private static final int TOTAL_NO_OF_TURNS = 9;

	public ResultAnalyzer(Board board) {
		this.board = board;;
	}

	public int getn() {
		return noOfturns;
	}

	public ResultType analyzeResult(int num, Mark mark) {

		this.noOfturns = noOfturns + 1;
		int row = num / 3;
		int column = num % 3;
		Mark cellMark = board.getCell()[row][column].getMark();
		Mark playerMark = mark;
		switch (num) {

		case 0:
			if (checkRight(row, column, playerMark)) {
				if (checkRight(row, ++column, playerMark)) {
					this.result = ResultType.WIN;;
					return this.getResult();

				}
				--column;
			}
			if (checkDown(row, column, playerMark)) {
				if (checkDown(++row, column, playerMark)) {
					result = ResultType.WIN;
					return this.getResult();
				}
				--row;
			}
			if (checkDiagonalDownRight(row, column, playerMark)) {
				if (checkDiagonalDownRight(++row, ++column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
				--row;
				--column;

			}
			break;
		case 1:
			if (checkLeft(row, column, playerMark)) {
				if (checkRight(row, column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
			}
			if (checkDown(row, column, playerMark)) {
				if (checkDown(++row, column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
				--row;
			}
			break;
		case 2:
			if (checkLeft(row, column, playerMark)) {
				if (checkLeft(row, --column, playerMark)) {
					System.out.println("endgame is 1");
					result = ResultType.WIN;;
					return this.getResult();
				}
				++column;
			}
			if (checkDown(row, column, playerMark)) {
				if (checkDown(++row, column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
				--row;
			}
			if (checkDiagonalDownLeft(row, column, playerMark)) {
				if (checkDiagonalDownLeft(++row, --column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
				--row;
				++column;

			}
			break;
		case 3:
			if (checkUp(row, column, playerMark)) {
				if (checkDown(row, column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
			}
			if (checkRight(row, column, playerMark)) {
				if (checkRight(row, ++column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
				--column;
			}
			break;
		case 4:
			if (checkUp(row, column, playerMark)) {
				if (checkDown(row, column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
			}
			if (checkRight(row, column, playerMark)) {
				if (checkLeft(row, column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
			}
			if (checkDiagonalUpRight(row, column, playerMark)) {
				if (checkDiagonalDownLeft(row, column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
			}
			if (checkDiagonalUpLeft(row, column, playerMark)) {
				if (checkDiagonalDownRight(row, column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
			}
			break;

		case 5:
			if (checkLeft(row, column, playerMark)) {
				if (checkLeft(row, --column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
				++column;
			}
			if (checkUp(row, column, playerMark)) {
				if (checkDown(row, column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
			}
			break;
		case 6:
			if (checkRight(row, column, playerMark)) {
				if (checkRight(row, ++column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
				--column;
			}
			if (checkUp(row, column, playerMark)) {
				if (checkUp(--row, column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
				++row;
			}
			if (checkDiagonalUpRight(row, column, playerMark)) {
				if (checkDiagonalUpRight(--row, ++column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
				++row;
				--column;

			}
			break;
		case 7:
			if (checkLeft(row, column, playerMark)) {
				if (checkRight(row, column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
			}
			if (checkUp(row, column, playerMark)) {
				if (checkUp(--row, column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
				++row;
			}
			break;

		case 8:
			if (checkLeft(row, column, playerMark)) {
				if (checkLeft(row, --column, playerMark)) {
					this.result = ResultType.WIN;;
					return this.getResult();
				}
				++column;
			}
			if (checkUp(row, column, playerMark)) {
				if (checkUp(--row, column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
				++row;
			}
			if (checkDiagonalUpLeft(row, column, playerMark)) {
				if (checkDiagonalUpLeft(--row, --column, playerMark)) {
					result = ResultType.WIN;;
					return this.getResult();
				}
				++row;
				++column;

			}
			break;

		default:
			break;
		}
		if (TOTAL_NO_OF_TURNS == noOfturns) {

			this.result = ResultType.DRAW;;
			return (this.getResult());

		} else {
			this.result = ResultType.PROGRESS;;
			return (this.getResult());
		}
	}

	public boolean checkUp(int row, int column, Mark mark) {
		return (board.getCell()[--row][column].getMark().equals(mark));

	}

	public boolean checkDown(int row, int column, Mark mark) {
		return (board.getCell()[++row][column].getMark().equals(mark));
	}

	public boolean checkRight(int row, int column, Mark mark) {
		return (board.getCell()[row][++column].getMark().equals(mark));

	}

	public boolean checkLeft(int row, int column, Mark mark) {
		return (board.getCell()[row][--column].getMark().equals(mark));

	}

	public boolean checkDiagonalUpLeft(int row, int column, Mark mark) {
		return (board.getCell()[--row][--column].getMark().equals(mark));

	}

	public boolean checkDiagonalUpRight(int row, int column, Mark mark) {
		return (board.getCell()[--row][++column].getMark().equals(mark));

	}

	public boolean checkDiagonalDownRight(int row, int column, Mark mark) {
		return (board.getCell()[++row][++column].getMark().equals(mark));

	}

	public boolean checkDiagonalDownLeft(int row, int column, Mark mark) {
		return (board.getCell()[++row][--column].getMark().equals(mark));

	}

	public ResultType getResult() {
		return result;
	}

	public Board getBoard() {
		return board;
	}

}
