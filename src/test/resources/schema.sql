CREATE TABLE food (
  id UUID DEFAULT RANDOM_UUID() PRIMARY KEY,
  food_name VARCHAR(255) NOT NULL,
  grams INTEGER NOT NULL,
  calories INTEGER NOT NULL,
  carbs INTEGER NOT NULL,
  protein INTEGER NOT NULL,
  fats INTEGER NOT NULL
);

INSERT INTO food
(food_name, grams, calories, carbs, protein, fats)
VALUES
    ('Arroz branco cozido', 100, 130, 28, 3, 0),
    ('Arroz integral cozido', 100, 124, 26, 3, 1),
    ('Feijão carioca cozido', 100, 76, 14, 5, 1),
    ('Feijão preto cozido', 100, 77, 14, 5, 1),
    ('Macarrão cozido', 100, 157, 31, 6, 1),
    ('Batata inglesa cozida', 100, 52, 12, 1, 0),
    ('Batata doce cozida', 100, 77, 18, 1, 0),
    ('Mandioca cozida', 100, 125, 30, 1, 0),
    ('Aveia em flocos', 100, 394, 67, 14, 8),

    ('Peito de frango grelhado', 100, 159, 0, 32, 3),
    ('Peito de frango cozido', 100, 163, 0, 31, 4),
    ('Patinho bovino grelhado', 100, 219, 0, 35, 8),
    ('Acém bovino cozido', 100, 215, 0, 32, 9),
    ('Alcatra bovina grelhada', 100, 241, 0, 31, 12),
    ('Filé mignon suíno', 100, 143, 0, 26, 4),
    ('Lombo suíno assado', 100, 210, 0, 29, 10),
    ('Salmão grelhado', 100, 208, 0, 20, 13),
    ('Tilápia grelhada', 100, 128, 0, 26, 3),
    ('Ovo cozido', 100, 155, 1, 13, 11),

    ('Leite integral', 100, 61, 5, 3, 3),
    ('Leite desnatado', 100, 35, 5, 4, 0),
    ('Iogurte natural integral', 100, 61, 5, 4, 3),
    ('Queijo muçarela', 100, 280, 3, 22, 21),
    ('Queijo minas frescal', 100, 264, 3, 17, 21),
    ('Requeijão cremoso', 100, 257, 3, 9, 24),

    ('Banana prata', 100, 98, 26, 1, 0),
    ('Maçã', 100, 52, 14, 0, 0),
    ('Mamão', 100, 40, 10, 1, 0),
    ('Manga', 100, 60, 15, 1, 0),
    ('Morango', 100, 30, 7, 1, 0),
    ('Abacate', 100, 160, 9, 2, 15),

    ('Brócolis cozido', 100, 35, 7, 2, 0),
    ('Cenoura cozida', 100, 35, 8, 1, 0),
    ('Abobrinha cozida', 100, 17, 3, 1, 0),
    ('Tomate', 100, 18, 4, 1, 0),
    ('Alface', 100, 15, 3, 1, 0),
    ('Couve manteiga', 100, 49, 9, 4, 1),

    ('Pão francês', 100, 300, 58, 9, 3),
    ('Pão integral', 100, 250, 43, 10, 4),
    ('Tapioca', 100, 230, 57, 0, 0),
    ('Farinha de mandioca', 100, 365, 88, 1, 0),

    ('Azeite de oliva', 100, 884, 0, 0, 100),
    ('Manteiga', 100, 717, 0, 1, 81),
    ('Pasta de amendoim', 100, 588, 20, 25, 50),
    ('Amendoim torrado', 100, 567, 16, 26, 49),
    ('Castanha de caju', 100, 553, 30, 18, 44)
;