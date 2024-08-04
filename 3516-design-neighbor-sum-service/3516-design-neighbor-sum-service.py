class neighborSum:
    def __init__(self, grid: List[List[int]]):
        self.grid = grid
        self.n = len(grid)
        self.position = {}
        for i in range(self.n):
            for j in range(self.n):
                self.position[grid[i][j]] = (i, j)

    def adjacentSum(self, value: int) -> int:
        if value not in self.position:
            return 0
        
        x, y = self.position[value]
        adja__positions = [(x - 1, y), (x + 1, y), (x, y - 1), (x, y + 1)]
        adja__sum = 0
        
        for nx, ny in adja__positions:
            if 0 <= nx < self.n and 0 <= ny < self.n:
                adja__sum += self.grid[nx][ny]
        
        return adja__sum

    def diagonalSum(self, value: int) -> int:
        if value not in self.position:
            return 0
        
        x, y = self.position[value]
        diag__positions = [(x - 1, y - 1), (x - 1, y + 1), (x + 1, y - 1), (x + 1, y + 1)]
        diag__sum = 0
        
        for nx, ny in diag__positions:
            if 0 <= nx < self.n and 0 <= ny < self.n:
                diag__sum += self.grid[nx][ny]
        
        return diag__sum