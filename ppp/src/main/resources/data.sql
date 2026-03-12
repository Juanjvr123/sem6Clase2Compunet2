INSERT INTO roles (name, description) VALUES 
('Admin', 'Administrator role with full access'),
('User', 'Standard user role with limited access');

-- Insert permissions
INSERT INTO permissions (name, description) VALUES 
('view-user', 'Permission to view user details'), -- 1
('delete-user', 'Permission to delete users'), -- 2
('update-user', 'Permission to update user details'), -- 3
('create-user', 'Permission to create new users'), -- 4
('view-role', 'Permission to view roles'), -- 5
('delete-role', 'Permission to delete roles'), -- 6
('update-role', 'Permission to update roles'), -- 7
('create-role', 'Permission to create new roles'), -- 8
('view-game', 'Permission to view games'), -- 9
('delete-game', 'Permission to delete games'), -- 10
('update-game', 'Permission to update games'), -- 11
('create-game', 'Permission to create new games'), -- 12
('view-permission', 'Permission to view permissions'), -- 13
('delete-permission', 'Permission to delete permissions'), -- 14
('update-permission', 'Permission to update permissions'), -- 15
('create-permission', 'Permission to create new permissions'); -- 16

-- Assign permissions to roles
INSERT INTO role_permissions (role_id, permission_id) VALUES 
(1, 1), (1, 2), (1, 3), (1, 4),
(1, 5), (1, 6), (1, 7), (1, 8),
(1, 9), (1, 10), (1, 11), (1, 12),
(1, 13), (1, 14), (1, 15), (1, 16),
(2, 1), (2, 9), (2, 12);

-- Insert users
INSERT INTO users (username, email, password_hash, bio, created_at, role_id) VALUES 
('admin', 'admin@example.com', 'hashed_password_1', 'Administrator account', CURRENT_TIMESTAMP, 1 ),
('user1', 'user1@example.com', 'hashed_password_2', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user2', 'user2@example.com', 'hashed_password_3', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user3', 'user3@example.com', 'hashed_password_4', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user4', 'user4@example.com', 'hashed_password_5', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user5', 'user5@example.com', 'hashed_password_6', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user6', 'user6@example.com', 'hashed_password_7', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user7', 'user7@example.com', 'hashed_password_8', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user8', 'user8@example.com', 'hashed_password_9', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user9', 'user9@example.com', 'hashed_password_10', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user10', 'user10@example.com', 'hashed_password_11', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user11', 'user11@example.com', 'hashed_password_12', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user12', 'user12@example.com', 'hashed_password_13', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user13', 'user13@example.com', 'hashed_password_14', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user14', 'user14@example.com', 'hashed_password_15', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user15', 'user15@example.com', 'hashed_password_16', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user16', 'user16@example.com', 'hashed_password_17', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user17', 'user17@example.com', 'hashed_password_18', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user18', 'user18@example.com', 'hashed_password_19', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user19', 'user19@example.com', 'hashed_password_20', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user20', 'user20@example.com', 'hashed_password_21', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user21', 'user21@example.com', 'hashed_password_22', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user22', 'user22@example.com', 'hashed_password_23', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user23', 'user23@example.com', 'hashed_password_24', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user24', 'user24@example.com', 'hashed_password_25', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user25', 'user25@example.com', 'hashed_password_26', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user26', 'user26@example.com', 'hashed_password_27', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user27', 'user27@example.com', 'hashed_password_28', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user28', 'user28@example.com', 'hashed_password_29', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user29', 'user29@example.com', 'hashed_password_30', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user30', 'user30@example.com', 'hashed_password_31', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user31', 'user31@example.com', 'hashed_password_32', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user32', 'user32@example.com', 'hashed_password_33', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user33', 'user33@example.com', 'hashed_password_34', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user34', 'user34@example.com', 'hashed_password_35', 'Standard user account', CURRENT_TIMESTAMP, 2 ),
('user35', 'user35@example.com', 'hashed_password_36', 'Standard user account', CURRENT_TIMESTAMP, 2 );

-- Insert sample games
INSERT INTO games (name, description, min_players, max_players, category, created_by) VALUES
('Catan', 'A strategy game about resource management and trading.', 3, 4, 'Strategy', 2),
('Ticket to Ride', 'A railway-themed board game.', 2, 5, 'Family', 2),
('Pandemic', 'A cooperative game where players work together to stop global outbreaks.', 2, 4, 'Cooperative', 2),
('Carcassonne', 'A tile-placement game where players build cities and roads.', 2, 5, 'Strategy', 2),
('Codenames', 'A word game where players guess the right words based on clues.', 2, 8, 'Party', 2),
('Azul', 'A tile-drafting game inspired by Portuguese tiles.', 2, 4, 'Abstract', 3),
('7 Wonders', 'A card drafting game about building civilizations.', 3, 7, 'Strategy', 3),
('Splendor', 'A game about collecting gems and building developments.', 2, 4, 'Card Game', 3),
('Dixit', 'A storytelling game with beautifully illustrated cards.', 3, 6, 'Party', 3),
('King of Tokyo', 'A dice game where players compete as monsters for dominance.', 2, 6, 'Dice', 3);

-- Insert sessions
INSERT INTO sessions (location, date_time, status, notes, game_id, host_id) VALUES
('Room 101', CURRENT_TIMESTAMP, 'Completed', 'Great session!', 1, 2),
('Room 202', CURRENT_TIMESTAMP, 'Scheduled', 'Upcoming session', 2, 3),
('Room 303', CURRENT_TIMESTAMP, 'Cancelled', 'Host unavailable', 3, 4);

-- Insert participants
INSERT INTO participants (score, position, winner, session_id, user_id) VALUES
(100, 1, true, 1, 2),
(80, 2, false, 1, 3),
(120, 1, true, 2, 4),
(90, 2, false, 2, 5),
(70, 3, false, 2, 6);

-- Insert comments
INSERT INTO comments (content, created_at, user_id, game_id) VALUES
('Amazing game!', CURRENT_TIMESTAMP, 2, 1),
('Had a lot of fun!', CURRENT_TIMESTAMP, 3, 2),
('Looking forward to the next session.', CURRENT_TIMESTAMP, 4, 3),
('Great strategy game!', CURRENT_TIMESTAMP, 5, 1),
('Loved the theme!', CURRENT_TIMESTAMP, 6, 2);