-- Returns user info for authentication
SELECT id, email, password_hash
FROM "app_user"
WHERE email = ?; 

-- Returns degree info
SELECT d.name, d.honours, d.total_credits
FROM app_user u
JOIN degree d ON u.degree_id = d.id
WHERE u.id = ?;
